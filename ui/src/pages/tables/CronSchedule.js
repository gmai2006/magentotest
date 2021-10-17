import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'scheduleId', header: 'scheduleId', defaultFlex: 1 },
  { name: 'jobCode', header: 'jobCode', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'messages', header: 'messages', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'scheduledAt', header: 'scheduledAt', defaultFlex: 1 },
  { name: 'executedAt', header: 'executedAt', defaultFlex: 1 },
  { name: 'finishedAt', header: 'finishedAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'cronschedule/selectAll',{
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

const CronSchedule = () => {
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

export default CronSchedule;