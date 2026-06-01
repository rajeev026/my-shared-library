def call(String status) {
    echo "Pipeline Status: ${status}"

    if (status == 'SUCCESS') {
        echo "Build completed successfully."
    } else if (status == 'FAILURE') {
        echo "Build failed. Please check Jenkins logs."
    } else {
        echo "Build status: ${status}"
    }
}
