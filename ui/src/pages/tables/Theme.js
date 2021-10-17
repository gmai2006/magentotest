import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'themeId', header: 'themeId', defaultFlex: 1 },
  { name: 'parentId', header: 'parentId', defaultFlex: 1 },
  { name: 'themePath', header: 'themePath', defaultFlex: 1 },
  { name: 'themeTitle', header: 'themeTitle', defaultFlex: 1 },
  { name: 'previewImage', header: 'previewImage', defaultFlex: 1 },
  { name: 'isFeatured', header: 'isFeatured', defaultFlex: 1 },
  { name: 'area', header: 'area', defaultFlex: 1 },
  { name: 'type', header: 'type', defaultFlex: 1 },
  { name: 'code', header: 'code', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'theme/selectAll',{
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

const Theme = () => {
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

export default Theme;