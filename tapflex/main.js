import React, { Component } from 'react';
import {
    StyleSheet,
    Text,
    View,
} from 'react-native'



import InitScene from './scenes/initial.js'
//import BoardView from './boardview.js'

export default class Main extends Component {
    render() {
        return <View style={styles.container}>
            <InitScene />
        </View>;
    }
}

var styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#644B62',
    },
});