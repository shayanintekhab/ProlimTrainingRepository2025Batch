let dd = new Date();
document.writeln("<br/>"+dd)
document.writeln("<br/>Date "+dd.getDate())
document.writeln("<br/>Month "+dd.getMonth())
document.writeln("<br/> Year "+dd.getFullYear())
dd.setMonth(dd.getMonth()+1)
document.writeln("<br/>AFter Set Month "+dd.getMonth())
document.writeln("<br/>Hours "+dd.getHours())
document.writeln("<br/>Minutes "+dd.getMinutes())
document.writeln("<br/>Seconds "+dd.getSeconds())


