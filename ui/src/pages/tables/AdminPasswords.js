import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'passwordId', header: 'passwordId', defaultFlex: 1 },
  { name: 'userId', header: 'userId', defaultFlex: 1 },
  { name: 'passwordHash', header: 'passwordHash', defaultFlex: 1 },
  { name: 'expires', header: 'expires', defaultFlex: 1 },
  { name: 'lastUpdated', header: 'lastUpdated', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'adminpasswords/selectAll',{
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

const AdminPasswords = () => {
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

export default AdminPasswords;