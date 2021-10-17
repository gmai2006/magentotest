import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'websiteId', header: 'websiteId', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'groupId', header: 'groupId', defaultFlex: 1 },
  { name: 'incrementId', header: 'incrementId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'isActive', header: 'isActive', defaultFlex: 1 },
  { name: 'disableAutoGroupChange', header: 'disableAutoGroupChange', defaultFlex: 1 },
  { name: 'createdIn', header: 'createdIn', defaultFlex: 1 },
  { name: 'prefix', header: 'prefix', defaultFlex: 1 },
  { name: 'firstname', header: 'firstname', defaultFlex: 1 },
  { name: 'middlename', header: 'middlename', defaultFlex: 1 },
  { name: 'lastname', header: 'lastname', defaultFlex: 1 },
  { name: 'suffix', header: 'suffix', defaultFlex: 1 },
  { name: 'dob', header: 'dob', defaultFlex: 1 },
  { name: 'passwordHash', header: 'passwordHash', defaultFlex: 1 },
  { name: 'rpToken', header: 'rpToken', defaultFlex: 1 },
  { name: 'rpTokenCreatedAt', header: 'rpTokenCreatedAt', defaultFlex: 1 },
  { name: 'defaultBilling', header: 'defaultBilling', defaultFlex: 1 },
  { name: 'defaultShipping', header: 'defaultShipping', defaultFlex: 1 },
  { name: 'taxvat', header: 'taxvat', defaultFlex: 1 },
  { name: 'confirmation', header: 'confirmation', defaultFlex: 1 },
  { name: 'gender', header: 'gender', defaultFlex: 1 },
  { name: 'failuresNum', header: 'failuresNum', defaultFlex: 1 },
  { name: 'firstFailure', header: 'firstFailure', defaultFlex: 1 },
  { name: 'lockExpires', header: 'lockExpires', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'customerentity/selectAll',{
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

const CustomerEntity = () => {
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

export default CustomerEntity;