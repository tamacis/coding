import React, { Component, PropTypes } from 'react';

import { View, Text, StyleSheet } from 'react-native';

import { NavigationExperimental } from 'react-native';

const {
  CardStack: NavigationCardStack,
  StateUtils: NavigationStateUtils,
} = NavigationExperimental;

//import { Actions } from 'react-native-router-flux';
import ActionBar from 'react-native-action-bar';

const styles = StyleSheet.create({
    toolbar: {
        height: 56,
        backgroundColor: '#212f2e',
        marginBottom : 20,
    },

    listItem: {
        marginTop : 10,
        height: 34,
        fontSize : 18
    }

});

export default class InitScene extends Component {

  constructor(props, context) {
    super(props, context);

    this.state = {
      // This defines the initial navigation state.
      navigationState: {
        index: 0, // Starts with first route focused.
        routes: [{key: 'My Initial Scene'}], // Starts with only one route.
      },
    };
    // We'll define this function later - hang on
    this._onNavigationChange = this._onNavigationChange.bind(this);
  }

  _onNavigationChange(type) {
       // Extract the navigationState from the current state:
  let {navigationState} = this.state;

  switch (type) {
    case 'push':
      // Push a new route, which in our case is an object with a key value.
      // I am fond of cryptic keys (but seriously, keys should be unique)
      const route = {key: 'Route-' + Date.now()};

      // Use the push reducer provided by NavigationStateUtils
      navigationState = NavigationStateUtils.push(navigationState, route);
      break;

    case 'pop':
      // Pop the current route using the pop reducer.
      navigationState = NavigationStateUtils.pop(navigationState);
      break;
  }

  // NavigationStateUtils gives you back the same `navigationState` if nothing
  // has changed. We will only update state if it has changed.
  if (this.state.navigationState !== navigationState) {
    // Always use setState() when setting a new state!
    this.setState({navigationState});
    // If you are new to ES6, the above is equivalent to:
    // this.setState({navigationState: navigationState});
  }
}

    render() {
        return (
            <View style={{ alignItems: 'center' }}>
                <ActionBar leftIconName={'none'} style={styles.toolbar} title={this.props.title} />
                <Text style={styles.listItem} onPress={Actions.lotsOfGreetings} >LotsOfGreetings </Text>
                <Text style={styles.listItem} > Banana</Text>
                <Text style={styles.listItem} > BlinkApp</Text>


            </View>

        )
    }
}
