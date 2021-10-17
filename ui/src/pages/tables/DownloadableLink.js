import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'linkId', header: 'linkId', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'sortOrder', header: 'sortOrder', defaultFlex: 1 },
  { name: 'numberOfDownloads', header: 'numberOfDownloads', defaultFlex: 1 },
  { name: 'isShareable', header: 'isShareable', defaultFlex: 1 },
  { name: 'linkUrl', header: 'linkUrl', defaultFlex: 1 },
  { name: 'linkFile', header: 'linkFile', defaultFlex: 1 },
  { name: 'linkType', header: 'linkType', defaultFlex: 1 },
  { name: 'sampleUrl', header: 'sampleUrl', defaultFlex: 1 },
  { name: 'sampleFile', header: 'sampleFile', defaultFlex: 1 },
  { name: 'sampleType', header: 'sampleType', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'downloadablelink/selectAll',{
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

const DownloadableLink = () => {
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

export default DownloadableLink;