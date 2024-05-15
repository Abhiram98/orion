# MemQ Orion Actions

### Pre-requisites

MemQ Orion requires Teletraan to manage memq hosts in memq clusters. The broker operations are done through Teletraan. 

Teletraan is Pinterest's deploy system. It deploys thousands of Pinterest internal services, supports tens of thousands hosts, and has been running in production for over many years. It empowers Pinterest Engineers to deliver their code to pinners fast and safe. 

Project Link: https://github.com/pinterest/teletraan

### Introduction

To use the MemQ actions, you need to create a new action class to extend the abstract class. 

In the new class, you need to override getTeletraanClient() method by constructing TeletraanClient with the right configuration. 

You also need to override getEC2Helper() method in your action class with your own way to get EC2 instance information. 

If the time value does not fit your case, you can override get time methods to use your own check interval or timeout values. 
