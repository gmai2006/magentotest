import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'userId', header: 'userId', defaultFlex: 1 },
  { name: 'firstname', header: 'firstname', defaultFlex: 1 },
  { name: 'lastname', header: 'lastname', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'username', header: 'username', defaultFlex: 1 },
  { name: 'password', header: 'password', defaultFlex: 1 },
  { name: 'created', header: 'created', defaultFlex: 1 },
  { name: 'modified', header: 'modified', defaultFlex: 1 },
  { name: 'logdate', header: 'logdate', defaultFlex: 1 },
  { name: 'lognum', header: 'lognum', defaultFlex: 1 },
  { name: 'reloadAclFlag', header: 'reloadAclFlag', defaultFlex: 1 },
  { name: 'isActive', header: 'isActive', defaultFlex: 1 },
  { name: 'extra', header: 'extra', defaultFlex: 1 },
  { name: 'rpToken', header: 'rpToken', defaultFlex: 1 },
  { name: 'rpTokenCreatedAt', header: 'rpTokenCreatedAt', defaultFlex: 1 },
  { name: 'interfaceLocale', header: 'interfaceLocale', defaultFlex: 1 },
  { name: 'failuresNum', header: 'failuresNum', defaultFlex: 1 },
  { name: 'firstFailure', header: 'firstFailure', defaultFlex: 1 },
  { name: 'lockExpires', header: 'lockExpires', defaultFlex: 1 },
  { name: 'refreshToken', header: 'refreshToken', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'adminuser/selectAll',{
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

const AdminUser = () => {
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

export default AdminUser;