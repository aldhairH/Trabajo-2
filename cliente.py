# ! / usr / bin / env python
import socket

port = 8888

while True :
   clientSocket = socket.socket( socket.AF_INET,socket.SOCK_STREAM)
   clientSocket.connect(('localhost',port ))
   message = input("Aqui escrive lo que quieres enviar \n")
   clientSocket.send(message.encode())