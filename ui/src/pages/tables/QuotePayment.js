import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'paymentId', header: 'paymentId', defaultFlex: 1 },
  { name: 'quoteId', header: 'quoteId', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'method', header: 'method', defaultFlex: 1 },
  { name: 'ccType', header: 'ccType', defaultFlex: 1 },
  { name: 'ccNumberEnc', header: 'ccNumberEnc', defaultFlex: 1 },
  { name: 'ccLast4', header: 'ccLast4', defaultFlex: 1 },
  { name: 'ccCidEnc', header: 'ccCidEnc', defaultFlex: 1 },
  { name: 'ccOwner', header: 'ccOwner', defaultFlex: 1 },
  { name: 'ccExpMonth', header: 'ccExpMonth', defaultFlex: 1 },
  { name: 'ccExpYear', header: 'ccExpYear', defaultFlex: 1 },
  { name: 'ccSsOwner', header: 'ccSsOwner', defaultFlex: 1 },
  { name: 'ccSsStartMonth', header: 'ccSsStartMonth', defaultFlex: 1 },
  { name: 'ccSsStartYear', header: 'ccSsStartYear', defaultFlex: 1 },
  { name: 'poNumber', header: 'poNumber', defaultFlex: 1 },
  { name: 'additionalData', header: 'additionalData', defaultFlex: 1 },
  { name: 'ccSsIssue', header: 'ccSsIssue', defaultFlex: 1 },
  { name: 'additionalInformation', header: 'additionalInformation', defaultFlex: 1 },
  { name: 'paypalPayerId', header: 'paypalPayerId', defaultFlex: 1 },
  { name: 'paypalPayerStatus', header: 'paypalPayerStatus', defaultFlex: 1 },
  { name: 'paypalCorrelationId', header: 'paypalCorrelationId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'quotepayment/selectAll',{
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

const QuotePayment = () => {
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

export default QuotePayment;