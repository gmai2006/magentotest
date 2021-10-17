import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'parentId', header: 'parentId', defaultFlex: 1 },
  { name: 'customerAddressId', header: 'customerAddressId', defaultFlex: 1 },
  { name: 'quoteAddressId', header: 'quoteAddressId', defaultFlex: 1 },
  { name: 'regionId', header: 'regionId', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'fax', header: 'fax', defaultFlex: 1 },
  { name: 'region', header: 'region', defaultFlex: 1 },
  { name: 'postcode', header: 'postcode', defaultFlex: 1 },
  { name: 'lastname', header: 'lastname', defaultFlex: 1 },
  { name: 'street', header: 'street', defaultFlex: 1 },
  { name: 'city', header: 'city', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'telephone', header: 'telephone', defaultFlex: 1 },
  { name: 'countryId', header: 'countryId', defaultFlex: 1 },
  { name: 'firstname', header: 'firstname', defaultFlex: 1 },
  { name: 'addressType', header: 'addressType', defaultFlex: 1 },
  { name: 'prefix', header: 'prefix', defaultFlex: 1 },
  { name: 'middlename', header: 'middlename', defaultFlex: 1 },
  { name: 'suffix', header: 'suffix', defaultFlex: 1 },
  { name: 'company', header: 'company', defaultFlex: 1 },
  { name: 'vatId', header: 'vatId', defaultFlex: 1 },
  { name: 'vatIsValid', header: 'vatIsValid', defaultFlex: 1 },
  { name: 'vatRequestId', header: 'vatRequestId', defaultFlex: 1 },
  { name: 'vatRequestDate', header: 'vatRequestDate', defaultFlex: 1 },
  { name: 'vatRequestSuccess', header: 'vatRequestSuccess', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesorderaddress/selectAll',{
    headers : {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
     }
  }).then(response => {
    return response.json().then(data => {
      console.log(data);
      return data;
    })
  })
}

const SalesOrderAddress = () => {
  const dataSource = useCallback(loadData, []);
  return (
      <ReactDataGrid
        idProperty="id"
        style={gridStyle}
        columns={columns}
        pagination
        defaultLimit={15}
        defaultSkip={15}
        dataSource={dataSource}
        />
  )
}

export default SalesOrderAddress;