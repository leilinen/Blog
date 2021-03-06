import Loadable from 'react-loadable';

// this is a simple react loadable 
// import Loadable from './loadable'
import { Loading } from '../components'

// import Dashboard from './Dashboard'
// import Login from './Login'
// import NotFound from './NotFound'
// import Settings from './Settings'
// import ArticleList from './Article'
// import ArticleEdit from './Article/Edit'


// this is lazy loading 
const Dashboard = Loadable({
    loader: () => import('./Dashboard'),
    loading: Loading
})

const NotFound = Loadable({
    loader: () => import('./NotFound'),
    loading: Loading
})

const Settings = Loadable({
    loader: () => import('./Settings'),
    loading: Loading
})

const Login = Loadable({
    loader: () => import('./Login'),
    loading: Loading
})

const ArticleList = Loadable({
    loader: () => import('./Article'),
    loading: Loading
})

const ArticleEdit = Loadable({
    loader: () => import('./Article/Edit'),
    loading: Loading
})

export {
    Dashboard,
    Login,
    NotFound,
    Settings,
    ArticleList,
    ArticleEdit
}