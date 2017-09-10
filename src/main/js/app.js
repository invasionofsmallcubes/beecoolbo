import React from 'react';
import { jsonServerRestClient, fetchUtils, Admin, Resource } from 'admin-on-rest';
const ReactDOM = require('react-dom');

import { PostList, PostEdit, PostCreate } from './employees';

const httpClient = (url, options = {}) => {
    options['credentials'] = 'include';
    return fetchUtils.fetchJson(url, options);
};

const App = () => (
        <Admin restClient={jsonServerRestClient('/api', httpClient)}>

        <Resource name="employees" list={PostList} edit={PostEdit} create={PostCreate} />

    </Admin>
);

export default App;

ReactDOM.render(
    <App />,
    document.getElementById('react')
);