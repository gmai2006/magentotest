import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'groupId', header: 'groupId', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'websiteId', header: 'websiteId', defaultFlex: 1 },
  { name: 'confirmation', header: 'confirmation', defaultFlex: 1 },
  { name: 'createdIn', header: 'createdIn', defaultFlex: 1 },
  { name: 'dob', header: 'dob', defaultFlex: 1 },
  { name: 'gender', header: 'gender', defaultFlex: 1 },
  { name: 'taxvat', header: 'taxvat', defaultFlex: 1 },
  { name: 'lockExpires', header: 'lockExpires', defaultFlex: 1 },
  { name: 'shippingFull', header: 'shippingFull', defaultFlex: 1 },
  { name: 'billingFull', header: 'billingFull', defaultFlex: 1 },
  { name: 'billingFirstname', header: 'billingFirstname', defaultFlex: 1 },
  { name: 'billingLastname', header: 'billingLastname', defaultFlex: 1 },
  { name: 'billingTelephone', header: 'billingTelephone', defaultFlex: 1 },
  { name: 'billingPostcode', header: 'billingPostcode', defaultFlex: 1 },
  { name: 'billingCountryId', header: 'billingCountryId', defaultFlex: 1 },
  { name: 'billingRegion', header: 'billingRegion', defaultFlex: 1 },
  { name: 'billingStreet', header: 'billingStreet', defaultFlex: 1 },
  { name: 'billingCity', header: 'billingCity', defaultFlex: 1 },
  { name: 'billingFax', header: 'billingFax', defaultFlex: 1 },
  { name: 'billingVatId', header: 'billingVatId', defaultFlex: 1 },
  { name: 'billingCompany', header: 'billingCompany', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'customergridflat/selectAll',{
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

const CustomerGridFlat = () => {
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

export default CustomerGridFlat;