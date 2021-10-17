import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'blockId', header: 'blockId', defaultFlex: 1 },
  { name: 'title', header: 'title', defaultFlex: 1 },
  { name: 'identifier', header: 'identifier', defaultFlex: 1 },
  { name: 'content', header: 'content', defaultFlex: 1 },
  { name: 'creationTime', header: 'creationTime', defaultFlex: 1 },
  { name: 'updateTime', header: 'updateTime', defaultFlex: 1 },
  { name: 'isActive', header: 'isActive', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'cmsblock/selectAll',{
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

const CmsBlock = () => {
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

export default CmsBlock;