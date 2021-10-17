import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'couponId', header: 'couponId', defaultFlex: 1 },
  { name: 'ruleId', header: 'ruleId', defaultFlex: 1 },
  { name: 'code', header: 'code', defaultFlex: 1 },
  { name: 'usageLimit', header: 'usageLimit', defaultFlex: 1 },
  { name: 'usagePerCustomer', header: 'usagePerCustomer', defaultFlex: 1 },
  { name: 'timesUsed', header: 'timesUsed', defaultFlex: 1 },
  { name: 'expirationDate', header: 'expirationDate', defaultFlex: 1 },
  { name: 'isPrimary', header: 'isPrimary', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'type', header: 'type', defaultFlex: 1 },
  { name: 'generatedByDotmailer', header: 'generatedByDotmailer', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesrulecoupon/selectAll',{
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

const SalesruleCoupon = () => {
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

export default SalesruleCoupon;