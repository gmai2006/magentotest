import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'period', header: 'period', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'orderStatus', header: 'orderStatus', defaultFlex: 1 },
  { name: 'ordersCount', header: 'ordersCount', defaultFlex: 1 },
  { name: 'totalQtyOrdered', header: 'totalQtyOrdered', defaultFlex: 1 },
  { name: 'totalQtyInvoiced', header: 'totalQtyInvoiced', defaultFlex: 1 },
  { name: 'totalIncomeAmount', header: 'totalIncomeAmount', defaultFlex: 1 },
  { name: 'totalRevenueAmount', header: 'totalRevenueAmount', defaultFlex: 1 },
  { name: 'totalProfitAmount', header: 'totalProfitAmount', defaultFlex: 1 },
  { name: 'totalInvoicedAmount', header: 'totalInvoicedAmount', defaultFlex: 1 },
  { name: 'totalCanceledAmount', header: 'totalCanceledAmount', defaultFlex: 1 },
  { name: 'totalPaidAmount', header: 'totalPaidAmount', defaultFlex: 1 },
  { name: 'totalRefundedAmount', header: 'totalRefundedAmount', defaultFlex: 1 },
  { name: 'totalTaxAmount', header: 'totalTaxAmount', defaultFlex: 1 },
  { name: 'totalTaxAmountActual', header: 'totalTaxAmountActual', defaultFlex: 1 },
  { name: 'totalShippingAmount', header: 'totalShippingAmount', defaultFlex: 1 },
  { name: 'totalShippingAmountActual', header: 'totalShippingAmountActual', defaultFlex: 1 },
  { name: 'totalDiscountAmount', header: 'totalDiscountAmount', defaultFlex: 1 },
  { name: 'totalDiscountAmountActual', header: 'totalDiscountAmountActual', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesorderaggregatedupdated/selectAll',{
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

const SalesOrderAggregatedUpdated = () => {
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

export default SalesOrderAggregatedUpdated;