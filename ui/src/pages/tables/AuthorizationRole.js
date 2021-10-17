import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'roleId', header: 'roleId', defaultFlex: 1 },
  { name: 'parentId', header: 'parentId', defaultFlex: 1 },
  { name: 'treeLevel', header: 'treeLevel', defaultFlex: 1 },
  { name: 'sortOrder', header: 'sortOrder', defaultFlex: 1 },
  { name: 'roleType', header: 'roleType', defaultFlex: 1 },
  { name: 'userId', header: 'userId', defaultFlex: 1 },
  { name: 'userType', header: 'userType', defaultFlex: 1 },
  { name: 'roleName', header: 'roleName', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'authorizationrole/selectAll',{
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

const AuthorizationRole = () => {
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

export default AuthorizationRole;