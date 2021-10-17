import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'primaryId', header: 'primaryId', defaultFlex: 1 },
  { name: 'entityPkValue', header: 'entityPkValue', defaultFlex: 1 },
  { name: 'entityType', header: 'entityType', defaultFlex: 1 },
  { name: 'reviewsCount', header: 'reviewsCount', defaultFlex: 1 },
  { name: 'ratingSummary', header: 'ratingSummary', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'reviewentitysummary/selectAll',{
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

const ReviewEntitySummary = () => {
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

export default ReviewEntitySummary;