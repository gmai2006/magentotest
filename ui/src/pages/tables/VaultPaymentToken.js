import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'publicHash', header: 'publicHash', defaultFlex: 1 },
  { name: 'paymentMethodCode', header: 'paymentMethodCode', defaultFlex: 1 },
  { name: 'type', header: 'type', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'expiresAt', header: 'expiresAt', defaultFlex: 1 },
  { name: 'gatewayToken', header: 'gatewayToken', defaultFlex: 1 },
  { name: 'details', header: 'details', defaultFlex: 1 },
  { name: 'isActive', header: 'isActive', defaultFlex: 1 },
  { name: 'isVisible', header: 'isVisible', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'vaultpaymenttoken/selectAll',{
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

const VaultPaymentToken = () => {
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

export default VaultPaymentToken;