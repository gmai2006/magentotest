import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'themeFilesId', header: 'themeFilesId', defaultFlex: 1 },
  { name: 'themeId', header: 'themeId', defaultFlex: 1 },
  { name: 'filePath', header: 'filePath', defaultFlex: 1 },
  { name: 'fileType', header: 'fileType', defaultFlex: 1 },
  { name: 'content', header: 'content', defaultFlex: 1 },
  { name: 'sortOrder', header: 'sortOrder', defaultFlex: 1 },
  { name: 'isTemporary', header: 'isTemporary', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'themefile/selectAll',{
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

const ThemeFile = () => {
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

export default ThemeFile;