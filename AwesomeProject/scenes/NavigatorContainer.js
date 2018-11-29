import React, { Component } from 'react';
import { NavigationExperimental} from 'react-native';

import RootNavigator from './RootNavigator'

export default class NavigatorContainer extends Component {
  render() {
    return (
        <RootNavigator
        onExit={this._exit}
      />
    );
  }
}