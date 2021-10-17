import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'problemId', header: 'problemId', defaultFlex: 1 },
  { name: 'subscriberId', header: 'subscriberId', defaultFlex: 1 },
  { name: 'queueId', header: 'queueId', defaultFlex: 1 },
  { name: 'problemErrorCode', header: 'problemErrorCode', defaultFlex: 1 },
  { name: 'problemErrorText', header: 'problemErrorText', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'newsletterproblem/selectAll',{
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

const NewsletterProblem = () => {
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

export default NewsletterProblem;