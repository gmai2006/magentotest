import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'templateId', header: 'templateId', defaultFlex: 1 },
  { name: 'templateCode', header: 'templateCode', defaultFlex: 1 },
  { name: 'templateText', header: 'templateText', defaultFlex: 1 },
  { name: 'templateStyles', header: 'templateStyles', defaultFlex: 1 },
  { name: 'templateType', header: 'templateType', defaultFlex: 1 },
  { name: 'templateSubject', header: 'templateSubject', defaultFlex: 1 },
  { name: 'templateSenderName', header: 'templateSenderName', defaultFlex: 1 },
  { name: 'templateSenderEmail', header: 'templateSenderEmail', defaultFlex: 1 },
  { name: 'templateActual', header: 'templateActual', defaultFlex: 1 },
  { name: 'addedAt', header: 'addedAt', defaultFlex: 1 },
  { name: 'modifiedAt', header: 'modifiedAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'newslettertemplate/selectAll',{
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

const NewsletterTemplate = () => {
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

export default NewsletterTemplate;