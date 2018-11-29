
import { NavigationExperimental } from 'react-native';
import {createStore} from 'redux'

const {
  StateUtils: NavigationStateUtils,
} = NavigationExperimental;

export const PUSH= 'PUSH';
export const POP = 'POP';

// This defines the initial navigation state.
export const initalState = {
        index: 0, // Starts with first route focused.
        routes: [{key: 'InitialScene'}], // Starts with only one route.
      };

export const store = createStore( (state = initalState, action) => {
  switch (action.type) {
    case PUSH:
      // Push a new route, which in our case is an object with a key value.
      // I am fond of cryptic keys (but seriously, keys should be unique)
      const route = {key: 'Route-' + Date.now()};

      // Use the push reducer provided by NavigationStateUtils
      navigationState = NavigationStateUtils.push(navigationState, route);
      break;

    case POP:
      // Pop the current route using the pop reducer.
      navigationState = NavigationStateUtils.pop(navigationState);
      break;
  }

});

