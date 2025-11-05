import React from 'react';
import styles from "./styles.module.css";

export default function Footer({text}: { text: string }): React.ReactElement {
    return (
        <div id={styles.footer}>
            {text}
            <br/>
            2025&copy; Stock Exchange Application
        </div>
    );
}
