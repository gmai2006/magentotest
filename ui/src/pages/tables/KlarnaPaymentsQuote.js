import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'paymentsQuoteId', header: 'paymentsQuoteId', defaultFlex: 1 },
  { name: 'sessionId', header: 'sessionId', defaultFlex: 1 },
  { name: 'clientToken', header: 'clientToken', defaultFlex: 1 },
  { name: 'authorizationToken', header: 'authorizationToken', defaultFlex: 1 },
  { name: 'isActive', header: 'isActive', defaultFlex: 1 },
  { name: 'quoteId', header: 'quoteId', defaultFlex: 1 },
  { name: 'paymentMethods', header: 'paymentMethods', defaultFlex: 1 },
  { name: 'paymentMethodInfo', header: 'paymentMethodInfo', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'klarnapaymentsquote/selectAll',{
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

const KlarnaPaymentsQuote = () => {
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

export default KlarnaPaymentsQuote;