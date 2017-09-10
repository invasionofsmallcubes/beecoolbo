import React from 'react';
import { jsonServerRestClient, Admin, Resource } from 'admin-on-rest';
const ReactDOM = require('react-dom');

import { PostList, PostEdit, PostCreate } from './employees';

const App = () => (
    <Admin restClient={jsonServerRestClient('http://localhost:5000/api')}>
        <Resource name="employees" list={PostList} edit={PostEdit} create={PostCreate} />
        // ...
    </Admin>
);

export default App;

ReactDOM.render(
    <App />,
    document.getElementById('react')
)