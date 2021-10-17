import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'sitemapId', header: 'sitemapId', defaultFlex: 1 },
  { name: 'sitemapType', header: 'sitemapType', defaultFlex: 1 },
  { name: 'sitemapFilename', header: 'sitemapFilename', defaultFlex: 1 },
  { name: 'sitemapPath', header: 'sitemapPath', defaultFlex: 1 },
  { name: 'sitemapTime', header: 'sitemapTime', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'sitemap/selectAll',{
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

const Sitemap = () => {
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

export default Sitemap;