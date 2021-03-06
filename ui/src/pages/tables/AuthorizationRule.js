import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'ruleId', header: 'ruleId', defaultFlex: 1 },
  { name: 'roleId', header: 'roleId', defaultFlex: 1 },
  { name: 'resourceId', header: 'resourceId', defaultFlex: 1 },
  { name: 'privileges', header: 'privileges', defaultFlex: 1 },
  { name: 'permission', header: 'permission', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'authorizationrule/selectAll',{
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

const AuthorizationRule = () => {
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

export default AuthorizationRule;