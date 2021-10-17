import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'logId', header: 'logId', defaultFlex: 1 },
  { name: 'userName', header: 'userName', defaultFlex: 1 },
  { name: 'userType', header: 'userType', defaultFlex: 1 },
  { name: 'failuresCount', header: 'failuresCount', defaultFlex: 1 },
  { name: 'lockExpiresAt', header: 'lockExpiresAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'oauthtokenrequestlog/selectAll',{
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

const OauthTokenRequestLog = () => {
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

export default OauthTokenRequestLog;