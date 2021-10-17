import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'purchasedId', header: 'purchasedId', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'orderIncrementId', header: 'orderIncrementId', defaultFlex: 1 },
  { name: 'orderItemId', header: 'orderItemId', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'productName', header: 'productName', defaultFlex: 1 },
  { name: 'productSku', header: 'productSku', defaultFlex: 1 },
  { name: 'linkSectionTitle', header: 'linkSectionTitle', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'downloadablelinkpurchased/selectAll',{
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

const DownloadableLinkPurchased = () => {
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

export default DownloadableLinkPurchased;