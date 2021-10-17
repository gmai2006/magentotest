import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'voteId', header: 'voteId', defaultFlex: 1 },
  { name: 'optionId', header: 'optionId', defaultFlex: 1 },
  { name: 'remoteIp', header: 'remoteIp', defaultFlex: 1 },
  { name: 'remoteIpLong', header: 'remoteIpLong', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'entityPkValue', header: 'entityPkValue', defaultFlex: 1 },
  { name: 'ratingId', header: 'ratingId', defaultFlex: 1 },
  { name: 'reviewId', header: 'reviewId', defaultFlex: 1 },
  { name: 'percent', header: 'percent', defaultFlex: 1 },
  { name: 'value', header: 'value', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'ratingoptionvote/selectAll',{
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

const RatingOptionVote = () => {
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

export default RatingOptionVote;