import React, { Component } from 'react';
import {
    StyleSheet,
    Text,
    View,
} from 'react-native'



import BoardView from './boardview.js'

export default class Main extends Component {
    render() {
        return <View style={styles.container}>
            <BoardView />
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