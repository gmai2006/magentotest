import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'bookmarkId', header: 'bookmarkId', defaultFlex: 1 },
  { name: 'userId', header: 'userId', defaultFlex: 1 },
  { name: 'namespace', header: 'namespace', defaultFlex: 1 },
  { name: 'identifier', header: 'identifier', defaultFlex: 1 },
  { name: 'current', header: 'current', defaultFlex: 1 },
  { name: 'title', header: 'title', defaultFlex: 1 },
  { name: 'config', header: 'config', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'uibookmark/selectAll',{
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

const UiBookmark = () => {
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

export default UiBookmark;