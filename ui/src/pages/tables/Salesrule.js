import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'ruleId', header: 'ruleId', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'description', header: 'description', defaultFlex: 1 },
  { name: 'fromDate', header: 'fromDate', defaultFlex: 1 },
  { name: 'toDate', header: 'toDate', defaultFlex: 1 },
  { name: 'usesPerCustomer', header: 'usesPerCustomer', defaultFlex: 1 },
  { name: 'isActive', header: 'isActive', defaultFlex: 1 },
  { name: 'conditionsSerialized', header: 'conditionsSerialized', defaultFlex: 1 },
  { name: 'actionsSerialized', header: 'actionsSerialized', defaultFlex: 1 },
  { name: 'stopRulesProcessing', header: 'stopRulesProcessing', defaultFlex: 1 },
  { name: 'isAdvanced', header: 'isAdvanced', defaultFlex: 1 },
  { name: 'productIds', header: 'productIds', defaultFlex: 1 },
  { name: 'sortOrder', header: 'sortOrder', defaultFlex: 1 },
  { name: 'simpleAction', header: 'simpleAction', defaultFlex: 1 },
  { name: 'discountAmount', header: 'discountAmount', defaultFlex: 1 },
  { name: 'discountQty', header: 'discountQty', defaultFlex: 1 },
  { name: 'discountStep', header: 'discountStep', defaultFlex: 1 },
  { name: 'applyToShipping', header: 'applyToShipping', defaultFlex: 1 },
  { name: 'timesUsed', header: 'timesUsed', defaultFlex: 1 },
  { name: 'isRss', header: 'isRss', defaultFlex: 1 },
  { name: 'couponType', header: 'couponType', defaultFlex: 1 },
  { name: 'useAutoGeneration', header: 'useAutoGeneration', defaultFlex: 1 },
  { name: 'usesPerCoupon', header: 'usesPerCoupon', defaultFlex: 1 },
  { name: 'simpleFreeShipping', header: 'simpleFreeShipping', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesrule/selectAll',{
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

const Salesrule = () => {
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

export default Salesrule;