import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'historyId', header: 'historyId', defaultFlex: 1 },
  { name: 'startedAt', header: 'startedAt', defaultFlex: 1 },
  { name: 'userId', header: 'userId', defaultFlex: 1 },
  { name: 'importedFile', header: 'importedFile', defaultFlex: 1 },
  { name: 'executionTime', header: 'executionTime', defaultFlex: 1 },
  { name: 'summary', header: 'summary', defaultFlex: 1 },
  { name: 'errorFile', header: 'errorFile', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'importhistory/selectAll',{
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

const ImportHistory = () => {
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

export default ImportHistory;