import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'importType', header: 'importType', defaultFlex: 1 },
  { name: 'websiteId', header: 'websiteId', defaultFlex: 1 },
  { name: 'importStatus', header: 'importStatus', defaultFlex: 1 },
  { name: 'importId', header: 'importId', defaultFlex: 1 },
  { name: 'importData', header: 'importData', defaultFlex: 1 },
  { name: 'importMode', header: 'importMode', defaultFlex: 1 },
  { name: 'importFile', header: 'importFile', defaultFlex: 1 },
  { name: 'message', header: 'message', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'importStarted', header: 'importStarted', defaultFlex: 1 },
  { name: 'importFinished', header: 'importFinished', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'emailimporter/selectAll',{
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

const EmailImporter = () => {
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

export default EmailImporter;