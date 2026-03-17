function go(url){
    window.location.href = url;
}

async function loadDashboard(){

    const data = await fetch("/api/shift-reports")
        .then(res => res.json());

    document.getElementById("reports").innerText = data.length;

    let table = "";

    data.forEach(r => {
        table += `
            <tr>
                <td>${r.mineSection}</td>
                <td>${r.shift}</td>
                <td>${r.supervisorName}</td>
            </tr>
        `;
    });

    document.getElementById("reportTable").innerHTML = table;

}

loadDashboard();