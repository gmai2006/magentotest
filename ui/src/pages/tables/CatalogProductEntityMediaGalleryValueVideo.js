import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'valueId', header: 'valueId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'provider', header: 'provider', defaultFlex: 1 },
  { name: 'url', header: 'url', defaultFlex: 1 },
  { name: 'title', header: 'title', defaultFlex: 1 },
  { name: 'description', header: 'description', defaultFlex: 1 },
  { name: 'metadata', header: 'metadata', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'catalogproductentitymediagalleryvaluevideo/selectAll',{
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

const CatalogProductEntityMediaGalleryValueVideo = () => {
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

export default CatalogProductEntityMediaGalleryValueVideo;