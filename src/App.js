import React, { Component } from 'react'

import { adminRouter } from './routes'

import {Route, Switch} from 'react-router-dom'


export default class App extends Component {
    render() {
        return(
            <div>
                <div>这里是公共的部分</div>
                <Switch>
                    {
                        adminRouter.map(
                            route => {
                                return <Route key={route.pathname} path={route.pathname} render={(routerProps) => {
                                    return <route.component {...routerProps} />
                                }}/>
                            }
                        )
                    }
                </Switch>
            </div>
        )
    }
}