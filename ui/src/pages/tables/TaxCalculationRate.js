import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'taxCalculationRateId', header: 'taxCalculationRateId', defaultFlex: 1 },
  { name: 'taxCountryId', header: 'taxCountryId', defaultFlex: 1 },
  { name: 'taxRegionId', header: 'taxRegionId', defaultFlex: 1 },
  { name: 'taxPostcode', header: 'taxPostcode', defaultFlex: 1 },
  { name: 'code', header: 'code', defaultFlex: 1 },
  { name: 'rate', header: 'rate', defaultFlex: 1 },
  { name: 'zipIsRange', header: 'zipIsRange', defaultFlex: 1 },
  { name: 'zipFrom', header: 'zipFrom', defaultFlex: 1 },
  { name: 'zipTo', header: 'zipTo', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'taxcalculationrate/selectAll',{
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

const TaxCalculationRate = () => {
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

export default TaxCalculationRate;