import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'queueId', header: 'queueId', defaultFlex: 1 },
  { name: 'templateId', header: 'templateId', defaultFlex: 1 },
  { name: 'newsletterType', header: 'newsletterType', defaultFlex: 1 },
  { name: 'newsletterText', header: 'newsletterText', defaultFlex: 1 },
  { name: 'newsletterStyles', header: 'newsletterStyles', defaultFlex: 1 },
  { name: 'newsletterSubject', header: 'newsletterSubject', defaultFlex: 1 },
  { name: 'newsletterSenderName', header: 'newsletterSenderName', defaultFlex: 1 },
  { name: 'newsletterSenderEmail', header: 'newsletterSenderEmail', defaultFlex: 1 },
  { name: 'queueStatus', header: 'queueStatus', defaultFlex: 1 },
  { name: 'queueStartAt', header: 'queueStartAt', defaultFlex: 1 },
  { name: 'queueFinishAt', header: 'queueFinishAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'newsletterqueue/selectAll',{
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

const NewsletterQueue = () => {
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

export default NewsletterQueue;