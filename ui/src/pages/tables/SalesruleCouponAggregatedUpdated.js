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
  { name: 'couponCode', header: 'couponCode', defaultFlex: 1 },
  { name: 'couponUses', header: 'couponUses', defaultFlex: 1 },
  { name: 'subtotalAmount', header: 'subtotalAmount', defaultFlex: 1 },
  { name: 'discountAmount', header: 'discountAmount', defaultFlex: 1 },
  { name: 'totalAmount', header: 'totalAmount', defaultFlex: 1 },
  { name: 'subtotalAmountActual', header: 'subtotalAmountActual', defaultFlex: 1 },
  { name: 'discountAmountActual', header: 'discountAmountActual', defaultFlex: 1 },
  { name: 'totalAmountActual', header: 'totalAmountActual', defaultFlex: 1 },
  { name: 'ruleName', header: 'ruleName', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesrulecouponaggregatedupdated/selectAll',{
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

const SalesruleCouponAggregatedUpdated = () => {
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

export default SalesruleCouponAggregatedUpdated;