import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'rowId', header: 'rowId', defaultFlex: 1 },
  { name: 'reportId', header: 'reportId', defaultFlex: 1 },
  { name: 'transactionId', header: 'transactionId', defaultFlex: 1 },
  { name: 'invoiceId', header: 'invoiceId', defaultFlex: 1 },
  { name: 'paypalReferenceId', header: 'paypalReferenceId', defaultFlex: 1 },
  { name: 'paypalReferenceIdType', header: 'paypalReferenceIdType', defaultFlex: 1 },
  { name: 'transactionEventCode', header: 'transactionEventCode', defaultFlex: 1 },
  { name: 'transactionInitiationDate', header: 'transactionInitiationDate', defaultFlex: 1 },
  { name: 'transactionCompletionDate', header: 'transactionCompletionDate', defaultFlex: 1 },
  { name: 'transactionDebitOrCredit', header: 'transactionDebitOrCredit', defaultFlex: 1 },
  { name: 'grossTransactionAmount', header: 'grossTransactionAmount', defaultFlex: 1 },
  { name: 'grossTransactionCurrency', header: 'grossTransactionCurrency', defaultFlex: 1 },
  { name: 'feeDebitOrCredit', header: 'feeDebitOrCredit', defaultFlex: 1 },
  { name: 'feeAmount', header: 'feeAmount', defaultFlex: 1 },
  { name: 'feeCurrency', header: 'feeCurrency', defaultFlex: 1 },
  { name: 'customField', header: 'customField', defaultFlex: 1 },
  { name: 'consumerId', header: 'consumerId', defaultFlex: 1 },
  { name: 'paymentTrackingId', header: 'paymentTrackingId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'paypalsettlementreportrow/selectAll',{
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

const PaypalSettlementReportRow = () => {
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

export default PaypalSettlementReportRow;