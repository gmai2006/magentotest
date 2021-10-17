import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'transactionId', header: 'transactionId', defaultFlex: 1 },
  { name: 'parentId', header: 'parentId', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'paymentId', header: 'paymentId', defaultFlex: 1 },
  { name: 'txnId', header: 'txnId', defaultFlex: 1 },
  { name: 'parentTxnId', header: 'parentTxnId', defaultFlex: 1 },
  { name: 'txnType', header: 'txnType', defaultFlex: 1 },
  { name: 'isClosed', header: 'isClosed', defaultFlex: 1 },
  { name: 'additionalInformation', header: 'additionalInformation', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salespaymenttransaction/selectAll',{
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

const SalesPaymentTransaction = () => {
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

export default SalesPaymentTransaction;