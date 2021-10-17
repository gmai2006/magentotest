import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'totalWeight', header: 'totalWeight', defaultFlex: 1 },
  { name: 'totalQty', header: 'totalQty', defaultFlex: 1 },
  { name: 'emailSent', header: 'emailSent', defaultFlex: 1 },
  { name: 'sendEmail', header: 'sendEmail', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'shippingAddressId', header: 'shippingAddressId', defaultFlex: 1 },
  { name: 'billingAddressId', header: 'billingAddressId', defaultFlex: 1 },
  { name: 'shipmentStatus', header: 'shipmentStatus', defaultFlex: 1 },
  { name: 'incrementId', header: 'incrementId', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'packages', header: 'packages', defaultFlex: 1 },
  { name: 'shippingLabel', header: 'shippingLabel', defaultFlex: 1 },
  { name: 'customerNote', header: 'customerNote', defaultFlex: 1 },
  { name: 'customerNoteNotify', header: 'customerNoteNotify', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesshipment/selectAll',{
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

const SalesShipment = () => {
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

export default SalesShipment;