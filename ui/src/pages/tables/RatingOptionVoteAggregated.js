import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'primaryId', header: 'primaryId', defaultFlex: 1 },
  { name: 'ratingId', header: 'ratingId', defaultFlex: 1 },
  { name: 'entityPkValue', header: 'entityPkValue', defaultFlex: 1 },
  { name: 'voteCount', header: 'voteCount', defaultFlex: 1 },
  { name: 'voteValueSum', header: 'voteValueSum', defaultFlex: 1 },
  { name: 'percent', header: 'percent', defaultFlex: 1 },
  { name: 'percentApproved', header: 'percentApproved', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'ratingoptionvoteaggregated/selectAll',{
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

const RatingOptionVoteAggregated = () => {
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

export default RatingOptionVoteAggregated;