/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

import { Button, Card } from 'react-native-material-design';

export default class MustDo extends Component {
  render() {
    return (
            <View>
                <Card>
                    <Card.Body>
                        <Text>I hate making UI.. :|s</Text>
                    </Card.Body>
                    <Card.Actions position="right">
                        <Button text="OPOP" value="ACTION" />
                    </Card.Actions>
                </Card>
            </View>
    );
  }
}


const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

AppRegistry.registerComponent('MustDo', () => MustDo);
