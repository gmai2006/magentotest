import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'mspTfaTrustedId', header: 'mspTfaTrustedId', defaultFlex: 1 },
  { name: 'dateTime', header: 'dateTime', defaultFlex: 1 },
  { name: 'userId', header: 'userId', defaultFlex: 1 },
  { name: 'deviceName', header: 'deviceName', defaultFlex: 1 },
  { name: 'token', header: 'token', defaultFlex: 1 },
  { name: 'lastIp', header: 'lastIp', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'msptfatrusted/selectAll',{
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

const MspTfaTrusted = () => {
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

export default MspTfaTrusted;