import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'incrementId', header: 'incrementId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'orderIncrementId', header: 'orderIncrementId', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'orderCreatedAt', header: 'orderCreatedAt', defaultFlex: 1 },
  { name: 'customerName', header: 'customerName', defaultFlex: 1 },
  { name: 'totalQty', header: 'totalQty', defaultFlex: 1 },
  { name: 'shipmentStatus', header: 'shipmentStatus', defaultFlex: 1 },
  { name: 'orderStatus', header: 'orderStatus', defaultFlex: 1 },
  { name: 'billingAddress', header: 'billingAddress', defaultFlex: 1 },
  { name: 'shippingAddress', header: 'shippingAddress', defaultFlex: 1 },
  { name: 'billingName', header: 'billingName', defaultFlex: 1 },
  { name: 'shippingName', header: 'shippingName', defaultFlex: 1 },
  { name: 'customerEmail', header: 'customerEmail', defaultFlex: 1 },
  { name: 'customerGroupId', header: 'customerGroupId', defaultFlex: 1 },
  { name: 'paymentMethod', header: 'paymentMethod', defaultFlex: 1 },
  { name: 'shippingInformation', header: 'shippingInformation', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesshipmentgrid/selectAll',{
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

const SalesShipmentGrid = () => {
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

export default SalesShipmentGrid;