import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'itemId', header: 'itemId', defaultFlex: 1 },
  { name: 'purchasedId', header: 'purchasedId', defaultFlex: 1 },
  { name: 'orderItemId', header: 'orderItemId', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'linkHash', header: 'linkHash', defaultFlex: 1 },
  { name: 'numberOfDownloadsBought', header: 'numberOfDownloadsBought', defaultFlex: 1 },
  { name: 'numberOfDownloadsUsed', header: 'numberOfDownloadsUsed', defaultFlex: 1 },
  { name: 'linkId', header: 'linkId', defaultFlex: 1 },
  { name: 'linkTitle', header: 'linkTitle', defaultFlex: 1 },
  { name: 'isShareable', header: 'isShareable', defaultFlex: 1 },
  { name: 'linkUrl', header: 'linkUrl', defaultFlex: 1 },
  { name: 'linkFile', header: 'linkFile', defaultFlex: 1 },
  { name: 'linkType', header: 'linkType', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'downloadablelinkpurchaseditem/selectAll',{
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

const DownloadableLinkPurchasedItem = () => {
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

export default DownloadableLinkPurchasedItem;