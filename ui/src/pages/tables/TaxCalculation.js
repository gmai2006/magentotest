import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'taxCalculationId', header: 'taxCalculationId', defaultFlex: 1 },
  { name: 'taxCalculationRateId', header: 'taxCalculationRateId', defaultFlex: 1 },
  { name: 'taxCalculationRuleId', header: 'taxCalculationRuleId', defaultFlex: 1 },
  { name: 'customerTaxClassId', header: 'customerTaxClassId', defaultFlex: 1 },
  { name: 'productTaxClassId', header: 'productTaxClassId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'taxcalculation/selectAll',{
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

const TaxCalculation = () => {
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

export default TaxCalculation;